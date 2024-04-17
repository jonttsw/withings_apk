package com.withings.healthplus.contentscreens.ui.navigation;

import com.withings.healthplus.contentscreens.ui.model.PlayerState;
import com.withings.healthplus.contentscreens.ui.viewmodel.ContentWorkoutPlayerViewModel;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class b extends w implements ym0.l<PlayerState, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ContentWorkoutPlayerViewModel f40141a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ContentWorkoutPlayerViewModel contentWorkoutPlayerViewModel) {
        super(1);
        this.f40141a = contentWorkoutPlayerViewModel;
    }

    @Override // ym0.l
    public final y invoke(PlayerState playerState) {
        PlayerState newState = playerState;
        u.j(newState, "newState");
        this.f40141a.F0(newState);
        return y.f85009a;
    }
}
