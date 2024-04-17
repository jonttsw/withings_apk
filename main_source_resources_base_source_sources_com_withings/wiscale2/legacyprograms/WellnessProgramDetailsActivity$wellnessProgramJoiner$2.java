package com.withings.wiscale2.legacyprograms;

import com.withings.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import x30.j;
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WellnessProgramDetailsActivity$wellnessProgramJoiner$2 extends w implements ym0.a<WellnessProgramJoiner> {
    final /* synthetic */ WellnessProgramDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramDetailsActivity$wellnessProgramJoiner$2(WellnessProgramDetailsActivity wellnessProgramDetailsActivity) {
        super(0);
        this.this$0 = wellnessProgramDetailsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final WellnessProgramJoiner invoke() {
        User user;
        WellnessProgramDetailsActivity wellnessProgramDetailsActivity = this.this$0;
        user = wellnessProgramDetailsActivity.getUser();
        u.i(user, "access$getUser(...)");
        j getProgramByIdUseCase = this.this$0.getGetProgramByIdUseCase();
        kn.e c11 = kn.e.c();
        u.i(c11, "get(...)");
        return new WellnessProgramJoiner(wellnessProgramDetailsActivity, user, getProgramByIdUseCase, c11, this.this$0, null, null, 96, null);
    }
}
