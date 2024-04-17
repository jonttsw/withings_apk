package com.withings.wiscale2.profile;

import androidx.compose.ui.platform.ComposeView;
import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.v4;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.profile.h;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class p0 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h.a f59421a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q f59422b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ComposeView f59423c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(h.a aVar, q qVar, ComposeView composeView) {
        super(3);
        this.f59421a = aVar;
        this.f59422b = qVar;
        this.f59423c = composeView;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            v4.a(null, ay.b.u(this.f59421a.a(), aVar2), ay.b.u(C1987R.string.profile_goal_description, aVar2), null, null, 0.0f, yk.h.a(), 0, 0, 3, aVar2, 805306368, 441);
            com.withings.common.compose.component.l.a(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), ay.b.u(C1987R.string.profile_goal_cta, aVar2), null, false, ColorStyle.f33324c, null, false, new o0(this.f59422b, this.f59423c), aVar2, 24576, 108);
        }
        return nm0.y.f85009a;
    }
}
