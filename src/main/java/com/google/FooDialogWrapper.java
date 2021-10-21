package com.google;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FooDialogWrapper extends DialogWrapper {
    protected FooDialogWrapper(@Nullable Project project) {
        super(project);
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        FooForm fooForm = new FooForm();
        return fooForm.rootPanel;
    }
}
