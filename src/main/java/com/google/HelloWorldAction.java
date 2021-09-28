package com.google;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class HelloWorldAction extends AnAction {
  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    System.out.println("hello world");
  }
}
