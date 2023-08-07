package edu.lab09;

import edu.shapes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CMainForm extends javax.swing.JFrame
{

	private JPanel mainPanel;

	private JPanel graphicArea;

	private CDocument document;




	private void createUIComponents()
	{
		graphicArea = new CGraphicArea();
	}
	public CMainForm(String title) throws HeadlessException{
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(mainPanel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		graphicArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				graphicAreaMousePressed(e);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				graphicAreaMouseReleased();
			}


		});


		graphicArea.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				super.mouseDragged(e);
				graphicAreaMouseDragged(e);
			}
		});

		document = new CDocument((CGraphicArea)graphicArea);
		document.addShape(new CShapeCircle(200,200,Color.BLACK,Color.red,70));
		document.addShape(new CShapeCircle(100,400,Color.blue,Color.green,70));
		document.addShape(new CAngleBar(300,400,Color.blue,Color.green,300,200,20));
		document.addShape(new CChannel(450,200,Color.blue,Color.green,200,200,60));
		document.addShape(new CPolyRTriangle(700, 400, Color.blue, Color.green, 300, 200));
		document.addShape(new CIbeam(400,600,Color.red,Color.green,300,200,60));
		document.addShape(new CTbar(800,600,Color.blue,Color.green,300,200,60));
		document.addShape(new CZetcher(1200,400,Color.blue,Color.green,300,200,60));
		document.redraw();

	}
	private void graphicAreaMousePressed(MouseEvent evt) {
		if(evt.getButton() ==MouseEvent.BUTTON1){
			if(document.selectShape (evt.getX(), evt.getY()))
				document.redraw();
		}
	}
	private void graphicAreaMouseReleased()
	{
		document.deselectShape();

		document.redraw();
	}

	private void graphicAreaMouseDragged (MouseEvent evt) {
		document.moveSelectedTo(evt.getX(), evt.getY());
		Long time = document.redraw();
		if(time > 0){
			setTitle(String.format("Kształtowniki, czas rysowania %d ms", time));
		}

	}
}
