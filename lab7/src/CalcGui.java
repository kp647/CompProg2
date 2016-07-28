import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcGui extends JFrame
{
    public static void main(String[] args)
    {
	CalcGui gui = new CalcGui();
	gui.setVisible(true);
    }

    private static final char[] supportedOperations = {'+', '-', '*', '/'};

    private static final int ENTERING_OP1 = 0;
    private static final int ENTERING_OP2 = 1;
    private static final int DISPLAYING_ANSWER = 2;

    private Calculator calculator;
    private Container pane;
    private CalcDisplay display;
    private int state;

    public CalcGui()
    {
	final int BUTTON_WIDTH = 70;
	final int BUTTON_HEIGHT = 30;
	final int BUTTON_XSPACING = 100;
	final int BUTTON_YSPACING = 50;

	JButton button;

	calculator = new Calculator();
	calculator.Clear();

	setTitle("Calculator");
	setSize(BUTTON_XSPACING*4, BUTTON_YSPACING*5 + 20);

	pane = getContentPane();
	pane.setLayout(null);

	for (int i = 1 ; i <= 9 ; i++) {
	    button = new NumberButton(i);
	    pane.add(button);
	    button.setBounds((i-1)%3 * BUTTON_XSPACING,
			     (9-i)/3 * BUTTON_YSPACING + BUTTON_YSPACING,
			     BUTTON_WIDTH,
			     BUTTON_HEIGHT);
	}
	button = new NumberButton(0);
	pane.add(button);
	button.setBounds(0,
			 BUTTON_YSPACING*4,
			 BUTTON_WIDTH,
			 BUTTON_HEIGHT);
       
	for (int i = 0 ; i < supportedOperations.length ; i++) {
	    button = new OperatorButton(supportedOperations[i]);
	    pane.add(button);
	    button.setBounds(BUTTON_XSPACING*3,
			     (i+1)*BUTTON_YSPACING,
			     BUTTON_WIDTH,
			     BUTTON_HEIGHT);
	}

	button = new ClearButton();
	pane.add(button);
	button.setBounds(BUTTON_XSPACING,
			 BUTTON_YSPACING*4,
			 BUTTON_WIDTH,
			 BUTTON_HEIGHT);
	
	button = new EqualsButton();
	pane.add(button);
	button.setBounds(BUTTON_XSPACING*2,
			 BUTTON_YSPACING*4,
			 BUTTON_WIDTH,
			 BUTTON_HEIGHT);

	display = new CalcDisplay();
	pane.add(display);
	display.setBounds(0, 10, BUTTON_XSPACING*4 - 20, BUTTON_HEIGHT);
	
	state = DISPLAYING_ANSWER;

	addWindowListener(new JFrameEventHandler());
    }

    private void repaintGui()
    {
	repaint();
    }

    private class JFrameEventHandler extends WindowAdapter
    {
	public void windowClosing(WindowEvent e)
	{
	    System.exit(0);    
	}
    }

    private class NumberButton extends JButton implements ActionListener
    {
	int digit;

	public NumberButton(int digit)
	{
	    super(String.valueOf(digit));
	    setHorizontalTextPosition(JButton.CENTER);
	    setVerticalTextPosition(JButton.CENTER);

	    this.digit = digit;

	    addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
	    switch (state) {
		
	    case ENTERING_OP1:
		calculator.EnterDigitOfFirstOperand(digit);
		display.setText(String.valueOf(calculator.GetFirstOperand()));
		break;
		
	    case ENTERING_OP2:
		calculator.EnterDigitOfSecondOperand(digit);
		display.setText(String.valueOf(calculator.GetSecondOperand()));
		break;
		
	    case DISPLAYING_ANSWER:
		calculator.Clear();
		state = ENTERING_OP1;
		calculator.EnterDigitOfFirstOperand(digit);
		display.setText(String.valueOf(calculator.GetFirstOperand()));
		break;
		
	    }
	}	
    }

    private class OperatorButton extends JButton implements ActionListener
    {
	char operator;
	
	public OperatorButton(char operator)
	{
	    super(String.valueOf(operator));
	    setHorizontalTextPosition(JButton.CENTER);
	    setVerticalTextPosition(JButton.CENTER);

	    this.operator = operator;

	    addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	    switch (state) {
		
	    case ENTERING_OP1:		
		calculator.EnterOperator(operator);
		state = ENTERING_OP2;
		break;
		
	    case ENTERING_OP2:
		break;
		
	    case DISPLAYING_ANSWER:
		break;

	    }
	}
    }
    
    private class EqualsButton extends JButton implements ActionListener
    {
	public EqualsButton()
	{
	    super("=");
	    setHorizontalTextPosition(JButton.CENTER);
	    setVerticalTextPosition(JButton.CENTER);

	    addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	    switch (state) {
		
	    case ENTERING_OP1:
		break;
		
	    case ENTERING_OP2:
		display.setText(String.valueOf(calculator.ComputeAnswer()));
		state = DISPLAYING_ANSWER;
		break;
		
	    case DISPLAYING_ANSWER:
		break;

	    }
	}
    }
    
    private class ClearButton extends JButton implements ActionListener
    {
	public ClearButton()
	{
	    super("CLR");
	    setHorizontalTextPosition(JButton.CENTER);
	    setVerticalTextPosition(JButton.CENTER);

	    addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	    calculator.Clear();
	    display.setText(String.valueOf(calculator.GetFirstOperand()));
	    state = ENTERING_OP1;
	}
    }

    private class CalcDisplay extends JLabel
    {
	public CalcDisplay()
	{
	    super("0");
	    setBorder(BorderFactory.createEtchedBorder());
	    setHorizontalAlignment(SwingConstants.RIGHT);	
    
	}
	
    }
    
}
