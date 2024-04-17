package com.withings.wiscale2.weight.list;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.withings.weight.legacy.WeightDetailActivity;
import e.n;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WeightListActivity.kt */
/* loaded from: classes5.dex */
final class d extends w implements ym0.l<ky.d, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n<Intent, ActivityResult> f62919a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WeightListActivity f62920b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n<Intent, ActivityResult> nVar, WeightListActivity weightListActivity) {
        super(1);
        this.f62919a = nVar;
        this.f62920b = weightListActivity;
    }

    @Override // ym0.l
    public final y invoke(ky.d dVar) {
        ky.d it = dVar;
        u.j(it, "it");
        WeightDetailActivity.f47005n.getClass();
        WeightListActivity context = this.f62920b;
        u.j(context, "context");
        Intent intent = new Intent(context, WeightDetailActivity.class);
        intent.putExtra("EXTRA_MEASURE_FILTER", 1);
        intent.putExtra("EXTRA_MEASURE_GROUP", it);
        this.f62919a.a(intent);
        return y.f85009a;
    }
}
