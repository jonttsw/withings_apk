package com.withings.survey.ui;

import java.util.List;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<List<z50.a>, nm0.y> f44301a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(ym0.l<? super List<z50.a>, nm0.y> lVar) {
        super(1);
        this.f44301a = lVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        this.f44301a.invoke(kotlin.collections.x.V(new z50.a(1, it)));
        return nm0.y.f85009a;
    }
}
