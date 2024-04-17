package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.material.c5;
import com.google.android.gms.fitness.data.Field;
import java.util.Map;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class m extends w implements ym0.l<Map<Field, ? extends String>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDetailActivity f59067a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59068b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f59069c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c5 c5Var, FitViewerDetailActivity fitViewerDetailActivity, CoroutineScope coroutineScope) {
        super(1);
        this.f59067a = fitViewerDetailActivity;
        this.f59068b = coroutineScope;
        this.f59069c = c5Var;
    }

    @Override // ym0.l
    public final y invoke(Map<Field, ? extends String> map) {
        Map<Field, ? extends String> mapping = map;
        u.j(mapping, "mapping");
        FitViewerDetailActivity.z3(this.f59067a, mapping);
        BuildersKt__Builders_commonKt.launch$default(this.f59068b, null, null, new l(this.f59069c, null), 3, null);
        return y.f85009a;
    }
}
