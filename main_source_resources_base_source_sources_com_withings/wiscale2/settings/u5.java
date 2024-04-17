package com.withings.wiscale2.settings;

import android.content.Context;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TracesLogsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.TracesLogsReader$read$2", f = "TracesLogsActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class u5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends String>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v5 f60337a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(v5 v5Var, qm0.d<? super u5> dVar) {
        super(2, dVar);
        this.f60337a = v5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new u5(this.f60337a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends String>> dVar) {
        return ((u5) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        BufferedReader bufferedReader;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        try {
            context = this.f60337a.f60353a;
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File(context.getFilesDir(), "rawDataSyncLogs.txt")), dp0.c.f64094b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, UserMetadata.MAX_INTERNAL_KEY_SIZE);
            }
            List A = cp0.n.A(wm0.f.a(bufferedReader));
            ge0.d.a(bufferedReader, null);
            return A;
        } catch (IOException unused) {
            return kotlin.collections.i0.f76187a;
        }
    }
}
