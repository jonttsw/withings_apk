package com.withings.wiscale2.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.withings.account.core.model.Account;
import com.withings.account.models.AccountKt;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;
import vf.c;
/* loaded from: classes5.dex */
public class TimeZoneReceiver extends BroadcastReceiver {
    public static void a() {
        c cVar;
        c cVar2;
        DateTimeZone.setDefault(DateTimeZone.forTimeZone(TimeZone.getDefault()));
        cVar = c.f103617d;
        if (cVar != null) {
            Account i11 = cVar.i();
            if (i11 != null && !i11.k().getID().equals(DateTimeZone.getDefault().getID())) {
                cVar2 = c.f103617d;
                if (cVar2 != null) {
                    cVar2.n(AccountKt.withTimeZone(i11, DateTimeZone.getDefault()));
                    return;
                }
                throw new IllegalArgumentException("You must call init before".toString());
            }
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a();
    }
}
