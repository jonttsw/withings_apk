package com.withings.extensions.legacy.android.content;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import kotlin.jvm.internal.u;
import nm0.y;
import ym0.p;
/* compiled from: ActivityResultHandler.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f39095a;

    public a(Context context) {
        u.j(context, "context");
        this.f39095a = context;
    }

    public final void a(Intent intent, final p<? super Integer, ? super Bundle, y> pVar) {
        int i11 = ActivityResultHandlerActivity.f39089c;
        Context context = this.f39095a;
        u.j(context, "context");
        final Handler handler = new Handler(Looper.getMainLooper());
        Intent putExtra = new Intent(context, ActivityResultHandlerActivity.class).putExtra("ARG_EXTRA_INTENT", intent).putExtra("ARG_EXTRA_RESULT_RECEIVER", new ResultReceiver(handler) { // from class: com.withings.extensions.legacy.android.content.ActivityResultHandlerActivity$Companion$getResultReceiver$1
            @Override // android.os.ResultReceiver
            protected final void onReceiveResult(int i12, Bundle bundle) {
                super.onReceiveResult(i12, bundle);
                pVar.invoke(Integer.valueOf(i12), bundle);
            }
        });
        u.i(putExtra, "putExtra(...)");
        context.startActivity(putExtra.addFlags(268435456));
    }
}
