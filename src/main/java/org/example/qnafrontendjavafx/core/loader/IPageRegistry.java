package org.example.qnafrontendjavafx.core.loader;

import org.example.qnafrontendjavafx.core.page.presentation.IPage;

import java.util.Map;

public interface IPageRegistry {
    Map<IPageType, IPage> getPages();
}