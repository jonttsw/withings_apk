package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
public final class v4 extends kotlin.jvm.internal.w implements ym0.l<List<Vasistas>, LiveData<q4>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveData<nm0.j<Track, List<Vasistas>>> f49739a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f49740b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f49741c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(xw.p pVar, Context context, User user) {
        super(1);
        this.f49739a = pVar;
        this.f49740b = context;
        this.f49741c = user;
    }

    @Override // ym0.l
    public final LiveData<q4> invoke(List<Vasistas> list) {
        List<Vasistas> list2 = list;
        return androidx.lifecycle.q.b(FlowKt.flow(new u4(androidx.lifecycle.q.a(this.f49739a), null, this.f49740b, this.f49741c, list2)), Dispatchers.getIO(), 2);
    }
}
