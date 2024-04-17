package com.withings.ecg.live;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.l0;
import com.withings.comm.wpp.generated.object.StoredMeasureMeta;
import com.withings.ecg.details.WaitingSignalResultActivity;
import com.withings.ecg.model.LiveEcgStatus;
import java.util.NoSuchElementException;
/* compiled from: LiveEcgScreensHandler.kt */
/* loaded from: classes3.dex */
public final class j0 implements l0<LiveEcgStatus> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f38687a;

    /* renamed from: b  reason: collision with root package name */
    private final u70.a f38688b;

    public j0(Context context, u70.a backgroundManager) {
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(backgroundManager, "backgroundManager");
        this.f38687a = context;
        this.f38688b = backgroundManager;
    }

    @Override // androidx.lifecycle.l0
    public final void onChanged(LiveEcgStatus liveEcgStatus) {
        Integer num;
        LiveEcgStatus liveEcgStatus2 = liveEcgStatus;
        Context context = this.f38687a;
        u70.a aVar = this.f38688b;
        if (liveEcgStatus2 != null && liveEcgStatus2.getStarted()) {
            liveEcgStatus2.getMacAddress();
            u70.i macAddress = liveEcgStatus2.getMacAddress();
            if (macAddress != null && aVar.e()) {
                if (androidx.compose.foundation.lazy.layout.d.i()) {
                    context.sendBroadcast(new Intent("ACTION_ECG_MEASUREMENT_STARTED").setPackage(context.getPackageName()));
                }
                LiveEcgActivity.f38589w.getClass();
                kotlin.jvm.internal.u.j(context, "context");
                Intent putExtra = new Intent(context, LiveEcgActivity.class).putExtra("mac", macAddress);
                kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
                context.startActivity(putExtra.addFlags(805306368));
            }
            context.sendBroadcast(new Intent("com.withings.ecg.EcgInstructionScreenActivity").setPackage(context.getPackageName()));
            context.sendBroadcast(new Intent("com.withings.core.FullScreenVideoActivity").setPackage(context.getPackageName()));
            return;
        }
        StoredMeasureMeta storedMeasureMeta = null;
        if (liveEcgStatus2 != null) {
            num = liveEcgStatus2.getStopReason();
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            context.sendBroadcast(new Intent("com.withings.wiscale2.activity.workout.gps.model.ui.closeEcgLiveViewActivity").setPackage(context.getPackageName()).putExtra("showError", true));
        } else if (num != null && num.intValue() == 0) {
            context.sendBroadcast(new Intent("com.withings.wiscale2.activity.workout.gps.model.ui.closeEcgLiveViewActivity").setPackage(context.getPackageName()));
            StoredMeasureMeta meta = liveEcgStatus2.getMeta();
            if (meta != null) {
                if (liveEcgStatus2.getEcgInserted()) {
                    storedMeasureMeta = meta;
                }
                if (storedMeasureMeta != null) {
                    long[] userId = storedMeasureMeta.userId;
                    kotlin.jvm.internal.u.i(userId, "userId");
                    for (long j5 : userId) {
                        if (j5 != 0) {
                            long j11 = storedMeasureMeta.time * 1000;
                            if (!aVar.d(0L)) {
                                if (androidx.compose.foundation.lazy.layout.d.i()) {
                                    context.sendBroadcast(new Intent("ACTION_ECG_MEASUREMENT_FINISHED").setPackage(context.getPackageName()));
                                    return;
                                }
                                WaitingSignalResultActivity.f38053i.getClass();
                                kotlin.jvm.internal.u.j(context, "context");
                                Intent putExtra2 = new Intent(context, WaitingSignalResultActivity.class).putExtra("extra_user_id", j5).putExtra("extra_timestamp", j11);
                                kotlin.jvm.internal.u.i(putExtra2, "putExtra(...)");
                                context.startActivity(putExtra2.addFlags(268435456));
                                return;
                            }
                            return;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        } else {
            context.sendBroadcast(new Intent("com.withings.wiscale2.activity.workout.gps.model.ui.closeEcgLiveViewActivity").setPackage(context.getPackageName()));
        }
    }
}
