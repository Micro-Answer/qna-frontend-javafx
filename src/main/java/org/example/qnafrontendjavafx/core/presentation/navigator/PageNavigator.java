package org.example.qnafrontendjavafx.core.presentation.navigator;

import org.example.qnafrontendjavafx.core.presentation.page.PageType;

public interface PageNavigator extends Start {
    void show(PageType type);
}