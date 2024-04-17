package com.withings.wiscale2.heart.afib;

import androidx.lifecycle.LiveData;
import com.withings.wiscale2.heart.afib.h0;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AFibMonthViewModel.kt */
/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.w implements ym0.l<h0.a, LiveData<List<rs.e>>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h0 f57184a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h0 h0Var) {
        super(1);
        this.f57184a = h0Var;
    }

    @Override // ym0.l
    public final LiveData<List<rs.e>> invoke(h0.a aVar) {
        h0.a afibStats = aVar;
        kotlin.jvm.internal.u.j(afibStats, "afibStats");
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new i0(this.f57184a, afibStats, null), 2);
    }
}
