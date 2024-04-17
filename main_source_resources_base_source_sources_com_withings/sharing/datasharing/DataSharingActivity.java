package com.withings.sharing.datasharing;

import android.os.Bundle;
import com.withings.features.FeatureFlag;
import e.k;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: DataSharingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/sharing/datasharing/DataSharingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DataSharingActivity extends Hilt_DataSharingActivity {

    /* compiled from: DataSharingActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f44000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DataSharingActivity f44001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DataSharingActivity dataSharingActivity) {
            super(2);
            this.f44000a = str;
            this.f44001b = dataSharingActivity;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, -1176947584, new c(this.f44000a, this.f44001b)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    @Override // com.withings.sharing.datasharing.Hilt_DataSharingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!wr.b.c(FeatureFlag.f39129s)) {
            finish();
        } else {
            k.a(this, new s1.a(true, -992351526, new a(getIntent().getStringExtra("invitation_hash"), this)));
        }
    }
}
