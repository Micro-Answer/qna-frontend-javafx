package org.example.qnafrontendjavafx.application.navigator;

import org.example.qnafrontendjavafx.core.presentation.page.PageType;

public enum ApplicationPageType implements PageType {
    /**
     * <b> 역할: 시작 화면 </b>
     */
    START_PAGE,

    /**
     * <b> 역할: 홈페이지 화면 </b>
     */
    HOME_PAGE,

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