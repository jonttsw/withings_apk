package com.withings.sharing.datasharing;

import androidx.compose.runtime.a;
import com.withings.sharing.datasharing.sendinvitation.i;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: DataSharingActivity.kt */
/* loaded from: classes4.dex */
final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f44084a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DataSharingActivity f44085b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, DataSharingActivity dataSharingActivity) {
        super(2);
        this.f44084a = str;
        this.f44085b = dataSharingActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            String str = this.f44084a;
            DataSharingActivity dataSharingActivity = this.f44085b;
            if (str == null) {
                aVar2.s(2074904367);
                aVar2.s(2074904421);
                boolean K = aVar2.K(dataSharingActivity);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new a(dataSharingActivity);
                    aVar2.n(t11);
                }
                aVar2.J();
                i.a((ym0.a) t11, aVar2, 0);
                aVar2.J();
            } else {
                aVar2.s(2074904501);
                aVar2.s(2074904614);
                boolean K2 = aVar2.K(dataSharingActivity);
                Object t12 = aVar2.t();
                if (K2 || t12 == a.C0060a.a()) {
                    t12 = new b(dataSharingActivity);
                    aVar2.n(t12);
                }
                aVar2.J();
                x40.e.a(str, (ym0.a) t12, aVar2, 0);
                aVar2.J();
            }
        }
        return y.f85009a;
    }
}
