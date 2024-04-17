package com.withings.badge.list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.l1;
import com.withings.authentication.n;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: BadgesActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/badge/list/BadgesActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "badge_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BadgesActivity extends Hilt_BadgesActivity {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f32793e = 0;

    /* compiled from: BadgesActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(Context context, long j5) {
            Intent putExtra = n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, BadgesActivity.class).putExtra(NavigationArguments.USER_ID, j5);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: BadgesActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, -69262191, new c(BadgesActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    @Override // com.withings.badge.list.Hilt_BadgesActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -1289213833, new b()));
    }
}
