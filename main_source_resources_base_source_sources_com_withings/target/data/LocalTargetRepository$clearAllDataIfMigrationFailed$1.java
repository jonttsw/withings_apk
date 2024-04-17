package com.withings.target.data;

import android.app.ActivityManager;
import android.content.Context;
import androidx.core.content.a;
import dp0.j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.l;
import nm0.y;
import qm0.d;
import x70.b;
import ym0.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.target.data.LocalTargetRepository$clearAllDataIfMigrationFailed$1", f = "LocalTargetRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LocalTargetRepository$clearAllDataIfMigrationFailed$1<T> extends i implements q<FlowCollector<? super T>, Throwable, d<? super y>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LocalTargetRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$clearAllDataIfMigrationFailed$1(LocalTargetRepository localTargetRepository, d<? super LocalTargetRepository$clearAllDataIfMigrationFailed$1> dVar) {
        super(3, dVar);
        this.this$0 = localTargetRepository;
    }

    @Override // ym0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th2, d<? super y> dVar) {
        return invoke((FlowCollector) ((FlowCollector) obj), th2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String message;
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            Throwable th2 = (Throwable) this.L$0;
            if ((th2 instanceof IllegalStateException) && (message = th2.getMessage()) != null && j.R(message, "Migration didn't properly handle:", false)) {
                b.n(new RoomMigrationFailure(th2));
                context = this.this$0.context;
                ActivityManager activityManager = (ActivityManager) a.getSystemService(context, ActivityManager.class);
                if (activityManager != null) {
                    activityManager.clearApplicationUserData();
                }
            }
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th2, d<? super y> dVar) {
        LocalTargetRepository$clearAllDataIfMigrationFailed$1 localTargetRepository$clearAllDataIfMigrationFailed$1 = new LocalTargetRepository$clearAllDataIfMigrationFailed$1(this.this$0, dVar);
        localTargetRepository$clearAllDataIfMigrationFailed$1.L$0 = th2;
        return localTargetRepository$clearAllDataIfMigrationFailed$1.invokeSuspend(y.f85009a);
    }
}
