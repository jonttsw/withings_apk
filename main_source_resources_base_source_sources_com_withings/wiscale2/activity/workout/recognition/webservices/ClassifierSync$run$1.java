package com.withings.wiscale2.activity.workout.recognition.webservices;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: ClassifierSync.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync$run$1", f = "ClassifierSync.kt", l = {21, 30}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ClassifierSync$run$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClassifierSync this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassifierSync$run$1(ClassifierSync classifierSync, d<? super ClassifierSync$run$1> dVar) {
        super(2, dVar);
        this.this$0 = classifierSync;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        ClassifierSync$run$1 classifierSync$run$1 = new ClassifierSync$run$1(this.this$0, dVar);
        classifierSync$run$1.L$0 = obj;
        return classifierSync$run$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r11.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            int r0 = r11.I$0
            nm0.l.b(r12)
            goto Lba
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            nm0.l.b(r12)
            goto L42
        L24:
            nm0.l.b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r1 = r11.this$0
            r70.c r1 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getUserRepository$p(r1)
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r5 = r11.this$0
            long r5 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getUserId$p(r5)
            r11.L$0 = r12
            r11.label = r4
            java.lang.Object r12 = r70.d.b(r1, r5, r11)
            if (r12 != r0) goto L42
            return r0
        L42:
            com.withings.user.core.models.User r12 = (com.withings.user.core.models.User) r12
            if (r12 != 0) goto L6d
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r12 = r11.this$0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            long r1 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getUserId$p(r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "User not found for id "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " in "
            r3.append(r1)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r0.<init>(r12)
            x70.b.n(r0)
            nm0.y r12 = nm0.y.f85009a
            return r12
        L6d:
            boolean r12 = r12.isShared()
            if (r12 == 0) goto L76
            nm0.y r12 = nm0.y.f85009a
            return r12
        L76:
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r12 = r11.this$0
            boolean r12 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$classifierHasBeenUpdatedOnWebServices(r12)
            if (r12 == 0) goto Le6
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r12 = r11.this$0
            com.withings.wiscale2.activity.workout.recognition.webservices.RecognitionRemoteRepository r12 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getRecognitionRemoteRepository$p(r12)
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r1 = r11.this$0
            java.lang.String r1 = r1.getSyncContext()
            com.withings.wiscale2.activity.workout.recognition.webservices.RecognitionRemoteRepository r4 = r12.withSyncContext(r1)
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r12 = r11.this$0
            com.withings.wiscale2.activity.workout.recognition.model.RecognitionManager r12 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getRecognitionManager$p(r12)
            int r12 = r12.getAlgoVersion()
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r1 = r11.this$0
            long r5 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getUserId$p(r1)
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r1 = r11.this$0
            com.withings.wiscale2.activity.workout.recognition.model.RecognitionManager r1 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getRecognitionManager$p(r1)
            int r8 = r1.getAlgoFormat()
            r11.L$0 = r2
            r11.I$0 = r12
            r11.label = r3
            r9 = 0
            r7 = r12
            r10 = r11
            java.lang.Object r1 = r4.getClassifierForUser(r5, r7, r8, r9, r10)
            if (r1 != r0) goto Lb8
            return r0
        Lb8:
            r0 = r12
            r12 = r1
        Lba:
            com.withings.wiscale2.activity.workout.recognition.webservices.WsClassifier$Response r12 = (com.withings.wiscale2.activity.workout.recognition.webservices.WsClassifier.Response) r12
            if (r12 == 0) goto Lc0
            com.withings.wiscale2.activity.workout.recognition.webservices.WsClassifier r2 = r12.classifier
        Lc0:
            if (r2 == 0) goto Ld7
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r1 = r11.this$0
            com.withings.wiscale2.activity.workout.recognition.model.RecognitionManager r1 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getRecognitionManager$p(r1)
            com.withings.wiscale2.activity.workout.recognition.model.Classifier r2 = new com.withings.wiscale2.activity.workout.recognition.model.Classifier
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r3 = r11.this$0
            long r3 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getUserId$p(r3)
            r2.<init>(r3, r0, r12)
            r1.saveClassifier(r2)
            goto Le6
        Ld7:
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r12 = r11.this$0
            com.withings.wiscale2.activity.workout.recognition.model.RecognitionManager r12 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getRecognitionManager$p(r12)
            com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync r0 = r11.this$0
            long r0 = com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync.access$getUserId$p(r0)
            r12.removeClassifierForUserId(r0)
        Le6:
            nm0.y r12 = nm0.y.f85009a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.recognition.webservices.ClassifierSync$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((ClassifierSync$run$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
