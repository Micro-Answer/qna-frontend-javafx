package org.example.qnafrontendjavafx.core.presentation.navigator;

import org.example.qnafrontendjavafx.core.presentation.page.Page;
import org.example.qnafrontendjavafx.core.presentation.page.PageType;

import java.util.Map;

public interface PageRegistry {
    Map<PageType, Page> getPages();
}