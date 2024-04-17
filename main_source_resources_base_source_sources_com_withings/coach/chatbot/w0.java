package com.withings.coach.chatbot;

import java.util.List;
/* compiled from: ConversationParser.kt */
/* loaded from: classes3.dex */
final class w0 extends kotlin.jvm.internal.w implements ym0.p<List<String>, List<String>, List<String>> {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f33123a = new kotlin.jvm.internal.w(2);

    @Override // ym0.p
    public final List<String> invoke(List<String> list, List<String> list2) {
        List<String> onTapActions = list;
        List<String> inputMetadataActions = list2;
        kotlin.jvm.internal.u.j(onTapActions, "onTapActions");
        kotlin.jvm.internal.u.j(inputMetadataActions, "inputMetadataActions");
        onTapActions.addAll(inputMetadataActions);
        return onTapActions;
    }
}
