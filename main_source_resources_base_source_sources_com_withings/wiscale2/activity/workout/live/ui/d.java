package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.track.data.Track;
/* compiled from: EndOfLiveWorkoutNotifier.kt */
/* loaded from: classes4.dex */
final class d extends kotlin.jvm.internal.w implements ym0.l<User, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Track f48864a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f48865b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Track track) {
        super(1);
        this.f48864a = track;
        this.f48865b = eVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(User user) {
        User user2 = user;
        kotlin.jvm.internal.u.j(user2, "user");
        Long id2 = this.f48864a.getId();
        if (id2 != null) {
            long longValue = id2.longValue();
            e eVar = this.f48865b;
            androidx.core.app.y.c(eVar.f()).e(null, ConstantsWs.WS_STATUS_WRONGMFGID, e.b(eVar, longValue, user2));
        }
        return nm0.y.f85009a;
    }
}
