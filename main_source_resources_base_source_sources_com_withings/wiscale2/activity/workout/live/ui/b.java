package com.withings.wiscale2.activity.workout.live.ui;

import android.content.Context;
import android.content.Intent;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.activity.workout.ui.detail.PostWorkoutActivity;
import com.withings.wiscale2.track.data.Track;
/* compiled from: EndOfLiveWorkoutNotifier.kt */
/* loaded from: classes4.dex */
final class b extends kotlin.jvm.internal.w implements ym0.l<User, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f48852a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Track f48853b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Track track) {
        super(1);
        this.f48852a = eVar;
        this.f48853b = track;
    }

    @Override // ym0.l
    public final nm0.y invoke(User user) {
        User user2 = user;
        kotlin.jvm.internal.u.j(user2, "user");
        e eVar = this.f48852a;
        Context f11 = eVar.f();
        PostWorkoutActivity.a aVar = PostWorkoutActivity.f49060k;
        Context context = eVar.f();
        Long id2 = this.f48853b.getId();
        kotlin.jvm.internal.u.g(id2);
        long longValue = id2.longValue();
        aVar.getClass();
        kotlin.jvm.internal.u.j(context, "context");
        Intent putExtra = new Intent(context, PostWorkoutActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user2).putExtra("workoutId", longValue);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        f11.startActivity(putExtra.addFlags(268435456));
        return nm0.y.f85009a;
    }
}
