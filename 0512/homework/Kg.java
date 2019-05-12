
/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @Date: 2019-05-12 20:29:57
 * @LastEditTime: 2019-05-12 21:16:07
 * @LastEditors: 靳肖健
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * 做一个窗体应用程序“体重指数计算器”，能根据用户输入的性别、身高、体重计算出“体质指数（身体质量指数）”，并给出是否偏胖的判断。其中，体质指数（BMI）=体重（kg）÷身高^2（m），大于24则为偏胖。要求有更详细的判断。要求有用户界面组件（如文本框、单选按钮、按钮）、布局和事件处理。
 * 
 * @author chunyan
 *
 */
public class Kg extends JFrame {
  JTextField height;
  JTextField weight;
  JLabel result;

  // 构造函数
  public Kg() {
    init();
  }

  // 初始化JFrame
  private void init() {
    this.setTitle("体重指数计算器");
    this.setSize(1111, 222);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 点击关闭
    this.setLocationRelativeTo(null);// 设置居中
    this.setContentPane(createContentPane());// 创建主面板
  }

  // 创建面板
  private Container createContentPane() {
    JPanel p = new JPanel(new BorderLayout());
    p.add(BorderLayout.NORTH, createNorthPane());

    p.add(BorderLayout.CENTER, createCenterPane());
    p.add(BorderLayout.SOUTH, createSouthPane());
    return p;
  }

  // 最北边的输入框
  private Component createNorthPane() {
    JPanel p = new JPanel();

    // if (key == 1) {
    JLabel label = new JLabel("性别：");
    ButtonGroup bg = new ButtonGroup();
    JRadioButton jrb1 = new JRadioButton("男");
    JRadioButton jrb2 = new JRadioButton("女");
    bg.add(jrb1);
    bg.add(jrb2);
    p.add(label);
    p.add(jrb1);
    p.add(jrb2);
    // } else if (key == 2) {

    // 身高，输入框
    JLabel label_height = new JLabel("身高(请输入身高，单位为：cm)：");
    height = new JTextField("", 20);
    p.add(label_height);
    p.add(height);
    // } else {
    // 体重，输入框
    JLabel label_weight = new JLabel("体重(请输入体重，单位为：kg)：");
    weight = new JTextField("", 20);
    p.add(label_weight);
    p.add(weight);
    // }
    return p;

  }

  // 中间的提交
  private Component createCenterPane() {
    JPanel p = new JPanel();
    JButton button = new JButton("检测身体素质");
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        Double h = Double.valueOf(height.getText()) / 100;
        Double w = Double.valueOf(weight.getText());
        Double bmi = w / (Math.pow(h, 2));
        if (bmi > 24) {
          result.setText("体质指数（身体质量指数）: " + bmi + " \t  提示 : 偏胖");
        } else if (bmi < 20) {
          result.setText("体质指数（身体质量指数）: " + bmi + " \t  提示 : 偏瘦");
        } else {
          result.setText("体质指数（身体质量指数）: " + bmi + " \t  提示 : 正常");
        }
      }
    });
    p.add(button);
    return p;
  }

  // 底部的结果显示
  private Component createSouthPane() {
    JPanel p = new JPanel();
    result = new JLabel("请输入参数！");
    p.add(result);
    return p;
  }

  public static void main(String[] args) {
    Kg demoFrame = new Kg();
    demoFrame.setVisible(true);
  }
}