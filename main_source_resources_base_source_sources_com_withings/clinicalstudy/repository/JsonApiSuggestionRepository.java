package com.withings.clinicalstudy.repository;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import nm0.l;
import nm0.y;
import oi.a;
import qm0.d;
import ym0.p;
/* compiled from: JsonApiSuggestionRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/withings/clinicalstudy/repository/JsonApiSuggestionRepository;", "Lcom/withings/clinicalstudy/repository/ClinicalStudySuggestionRepository;", "", "measureType", "modelId", "", "", "getFor", "(ILjava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/clinicalstudy/repository/JsonClinicalStudySuggestionRepository;", "jsonClinicalStudySuggestionRepository", "Lcom/withings/clinicalstudy/repository/JsonClinicalStudySuggestionRepository;", "Loi/a;", "getRemoteJsonSuggestion", "Loi/a;", "<init>", "(Lcom/withings/clinicalstudy/repository/JsonClinicalStudySuggestionRepository;Loi/a;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class JsonApiSuggestionRepository implements ClinicalStudySuggestionRepository {
    private final a getRemoteJsonSuggestion;
    private final JsonClinicalStudySuggestionRepository jsonClinicalStudySuggestionRepository;

    /* compiled from: JsonApiSuggestionRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.clinicalstudy.repository.JsonApiSuggestionRepository$1", f = "JsonApiSuggestionRepository.kt", l = {16}, m = "invokeSuspend")
    /* renamed from: com.withings.clinicalstudy.repository.JsonApiSuggestionRepository$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends i implements p<CoroutineScope, d<? super y>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JsonClinicalStudySuggestionRepository jsonClinicalStudySuggestionRepository;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    jsonClinicalStudySuggestionRepository = (JsonClinicalStudySuggestionRepository) this.L$0;
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                JsonClinicalStudySuggestionRepository jsonClinicalStudySuggestionRepository2 = JsonApiSuggestionRepository.this.jsonClinicalStudySuggestionRepository;
                a aVar = JsonApiSuggestionRepository.this.getRemoteJsonSuggestion;
                this.L$0 = jsonClinicalStudySuggestionRepository2;
                this.label = 1;
                Object b10 = aVar.b(this);
                if (b10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                jsonClinicalStudySuggestionRepository = jsonClinicalStudySuggestionRepository2;
                obj = b10;
            }
            jsonClinicalStudySuggestionRepository.setJson((String) obj);
            return y.f85009a;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }
    }

    @Inject
    public JsonApiSuggestionRepository(JsonClinicalStudySuggestionRepository jsonClinicalStudySuggestionRepository, a getRemoteJsonSuggestion) {
        u.j(jsonClinicalStudySuggestionRepository, "jsonClinicalStudySuggestionRepository");
        u.j(getRemoteJsonSuggestion, "getRemoteJsonSuggestion");
        this.jsonClinicalStudySuggestionRepository = jsonClinicalStudySuggestionRepository;
        this.getRemoteJsonSuggestion = getRemoteJsonSuggestion;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[PHI: r9 
      PHI: (r9v10 java.lang.Object) = (r9v7 java.lang.Object), (r9v1 java.lang.Object) binds: [B:25:0x0080, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.withings.clinicalstudy.repository.ClinicalStudySuggestionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getFor(int r7, java.lang.Integer r8, qm0.d<? super java.util.List<java.lang.String>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.withings.clinicalstudy.repository.JsonApiSuggestionRepository$getFor$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.clinicalstudy.repository.JsonApiSuggestionRepository$getFor$1 r0 = (com.withings.clinicalstudy.repository.JsonApiSuggestionRepository$getFor$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.clinicalstudy.repository.JsonApiSuggestionRepository$getFor$1 r0 = new com.withings.clinicalstudy.repository.JsonApiSuggestionRepository$getFor$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r9)
            goto L83
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$2
            com.withings.clinicalstudy.repository.JsonClinicalStudySuggestionRepository r8 = (com.withings.clinicalstudy.repository.JsonClinicalStudySuggestionRepository) r8
            java.lang.Object r2 = r0.L$1
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.L$0
            com.withings.clinicalstudy.repository.JsonApiSuggestionRepository r4 = (com.withings.clinicalstudy.repository.JsonApiSuggestionRepository) r4
            nm0.l.b(r9)
            goto L69
        L44:
            nm0.l.b(r9)
            com.withings.clinicalstudy.repository.JsonClinicalStudySuggestionRepository r9 = r6.jsonClinicalStudySuggestionRepository
            java.lang.String r9 = r9.getJson()
            if (r9 != 0) goto L70
            com.withings.clinicalstudy.repository.JsonClinicalStudySuggestionRepository r9 = r6.jsonClinicalStudySuggestionRepository
            oi.a r2 = r6.getRemoteJsonSuggestion
            r0.L$0 = r6
            r0.L$1 = r8
            r0.L$2 = r9
            r0.I$0 = r7
            r0.label = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 != r1) goto L64
            return r1
        L64:
            r4 = r6
            r5 = r2
            r2 = r8
            r8 = r9
            r9 = r5
        L69:
            java.lang.String r9 = (java.lang.String) r9
            r8.setJson(r9)
            r8 = r2
            goto L71
        L70:
            r4 = r6
        L71:
            com.withings.clinicalstudy.repository.JsonClinicalStudySuggestionRepository r9 = r4.jsonClinicalStudySuggestionRepository
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r9 = r9.getFor(r7, r8, r0)
            if (r9 != r1) goto L83
            return r1
        L83:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.clinicalstudy.repository.JsonApiSuggestionRepository.getFor(int, java.lang.Integer, qm0.d):java.lang.Object");
    }
}
