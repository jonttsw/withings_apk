package com.withings.wiscale2.user.ui.profile;

import androidx.compose.material.c5;
import androidx.compose.ui.platform.k4;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
final class u extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f62077a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f62078b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<BottomSheetType> f62079c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c5 f62080d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(k4 k4Var, CoroutineScope coroutineScope, k1.r0<BottomSheetType> r0Var, c5 c5Var) {
        super(0);
        this.f62077a = k4Var;
        this.f62078b = coroutineScope;
        this.f62079c = r0Var;
        this.f62080d = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BottomSheetType bottomSheetType = BottomSheetType.f33477f;
        EditProfileActivity.G3(this.f62077a, this.f62078b, this.f62079c, this.f62080d, bottomSheetType);
        return nm0.y.f85009a;
    }
}
