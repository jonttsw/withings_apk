package com.withings.leaderboard.ui.screen;

import androidx.compose.runtime.a;
import ay.b;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: LeaderboardItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.withings.leaderboard.ui.screen.ComposableSingletons$LeaderboardItemKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$LeaderboardItemKt$lambda1$1 extends w implements p<a, Integer, y> {
    public static final ComposableSingletons$LeaderboardItemKt$lambda1$1 INSTANCE = new ComposableSingletons$LeaderboardItemKt$lambda1$1();

    ComposableSingletons$LeaderboardItemKt$lambda1$1() {
        super(2);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
        } else {
            LeaderboardItemKt.LeaderBoardItem(null, b.u(C1987R.string._LEADERBOARD_, aVar), null, Integer.valueOf((int) SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES), "1st", i0.f76187a, aVar, 224256, 5);
        }
    }
}
