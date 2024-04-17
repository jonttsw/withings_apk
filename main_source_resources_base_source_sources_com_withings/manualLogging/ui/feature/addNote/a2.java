package com.withings.manualLogging.ui.feature.addNote;

import com.withings.manualLogging.ui.common.LogType;
import com.withings.manualLogging.ui.uikit.atoms.ManualLogCategory;
import com.withings.user.User;
import java.util.List;
/* compiled from: SelectManualLogCategoryScreen.kt */
/* loaded from: classes4.dex */
final class a2 extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<ManualLogCategory, nm0.y> f40718a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LogType f40719b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<ManualLogCategory> f40720c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ User f40721d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f40722e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a2(ym0.l<? super ManualLogCategory, nm0.y> lVar, LogType logType, List<? extends ManualLogCategory> list, User user, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
        super(1);
        this.f40718a = lVar;
        this.f40719b = logType;
        this.f40720c = list;
        this.f40721d = user;
        this.f40722e = pVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(s0.i0 i0Var) {
        s0.i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        s0.i0.g(LazyColumn, null, u1.f41595a, 3);
        s0.i0.g(LazyColumn, null, new s1.a(true, 303444387, new x1(this.f40718a, this.f40719b, this.f40720c, this.f40721d)), 3);
        s0.i0.g(LazyColumn, null, new s1.a(true, 874673730, new z1(this.f40722e)), 3);
        return nm0.y.f85009a;
    }
}
