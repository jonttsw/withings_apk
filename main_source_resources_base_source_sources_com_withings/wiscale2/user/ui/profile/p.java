package com.withings.wiscale2.user.ui.profile;

import androidx.compose.material.c5;
import androidx.compose.ui.platform.k4;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
final class p extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f62012a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f62013b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<BottomSheetType> f62014c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c5 f62015d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k4 k4Var, CoroutineScope coroutineScope, k1.r0<BottomSheetType> r0Var, c5 c5Var) {
        super(0);
        this.f62012a = k4Var;
        this.f62013b = coroutineScope;
        this.f62014c = r0Var;
        this.f62015d = c5Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BottomSheetType bottomSheetType = BottomSheetType.f33473b;
        EditProfileActivity.G3(this.f62012a, this.f62013b, this.f62014c, this.f62015d, bottomSheetType);
        return nm0.y.f85009a;
    }
}
