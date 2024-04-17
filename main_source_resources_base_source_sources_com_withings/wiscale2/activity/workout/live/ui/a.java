package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.user.User;
import com.withings.wiscale2.track.data.Track;
/* compiled from: EndOfLiveWorkoutNotifier.kt */
/* loaded from: classes4.dex */
final class a extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f48847a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Track f48848b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Track track) {
        super(0);
        this.f48847a = eVar;
        this.f48848b = track;
    }

    @Override // ym0.a
    public final User invoke() {
        User i11 = this.f48847a.g().i(this.f48848b.getUserId());
        kotlin.jvm.internal.u.i(i11, "getUserById(...)");
        return i11;
    }
}
