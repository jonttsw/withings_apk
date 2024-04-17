package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.user.User;
import com.withings.wiscale2.track.data.Track;
/* compiled from: EndOfLiveWorkoutNotifier.kt */
/* loaded from: classes4.dex */
final class c extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f48859a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Track f48860b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Track track) {
        super(0);
        this.f48859a = eVar;
        this.f48860b = track;
    }

    @Override // ym0.a
    public final User invoke() {
        User i11 = this.f48859a.g().i(this.f48860b.getUserId());
        kotlin.jvm.internal.u.i(i11, "getUserById(...)");
        return i11;
    }
}
