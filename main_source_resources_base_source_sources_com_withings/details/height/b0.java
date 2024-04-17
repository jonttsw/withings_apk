package com.withings.details.height;

import androidx.camera.camera2.internal.q2;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.material.t5;
import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36579a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(HeightListActivity heightListActivity) {
        super(2);
        this.f36579a = heightListActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Object a11 = q2.a(aVar2, 773894976, -492369756);
            if (a11 == a.C0060a.a()) {
                a11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
            }
            aVar2.J();
            CoroutineScope a12 = ((androidx.compose.runtime.k) a11).a();
            aVar2.J();
            c5 f11 = f4.f(ModalBottomSheetValue.f4842a, null, false, aVar2, 14);
            HeightListActivity heightListActivity = this.f36579a;
            t5.b(null, null, s1.b.b(aVar2, -1014002590, new w(heightListActivity, a12, f11)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, 265066395, new a0(f11, heightListActivity)), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 12582912, 131067);
        }
        return nm0.y.f85009a;
    }
}
