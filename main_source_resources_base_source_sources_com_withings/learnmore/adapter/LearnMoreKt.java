package com.withings.learnmore.adapter;

import dp0.j;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: LearnMore.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"articleId", "", "Lcom/withings/learnmore/adapter/LearnMoreEntry;", "getArticleId", "(Lcom/withings/learnmore/adapter/LearnMoreEntry;)Ljava/lang/String;", "learnmore_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LearnMoreKt {
    public static final String getArticleId(LearnMoreEntry learnMoreEntry) {
        u.j(learnMoreEntry, "<this>");
        return (String) x.T(j.o(learnMoreEntry.getUrl(), new String[]{"/"}));
    }
}
