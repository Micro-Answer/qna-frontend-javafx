package org.example.qnafrontendjavafx.application.loader;

import org.example.qnafrontendjavafx.core.loader.IPageType;

public enum PageType implements IPageType {
    /**
     * <b> 역할: 로그인 화면 </b>
     */
    LOGIN_PAGE,

    /**
     * <b> 역할: 전문가 회원가입 화면 </b>
     */
    EXPERT_SIGN_UP_PAGE,

    /**
     * <b> 역할: 일반 유저 회원가입 화면 </b>
     */
    GENERAL_USER_SIGN_UP_PAGE,
}