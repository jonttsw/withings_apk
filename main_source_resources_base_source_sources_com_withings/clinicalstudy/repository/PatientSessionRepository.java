package com.withings.clinicalstudy.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.joda.time.DateTime;
import qi.a;
import qm0.d;
/* compiled from: PatientSessionRepository.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/withings/clinicalstudy/repository/PatientSessionRepository;", "", "Lorg/joda/time/DateTime;", "timestamp", "Lqi/a;", "get", "(Lorg/joda/time/DateTime;Lqm0/d;)Ljava/lang/Object;", "patientSession", "Lnm0/y;", DiscoverItems.Item.UPDATE_ACTION, "(Lqi/a;Lqm0/d;)Ljava/lang/Object;", "Companion", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface PatientSessionRepository {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: PatientSessionRepository.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lcom/withings/clinicalstudy/repository/PatientSessionRepository$Companion;", "", "Lcom/withings/clinicalstudy/repository/PatientSessionRepository;", "get", "()Lcom/withings/clinicalstudy/repository/PatientSessionRepository;", "instance", "Lnm0/y;", "init", "(Lcom/withings/clinicalstudy/repository/PatientSessionRepository;)V", "Lcom/withings/clinicalstudy/repository/PatientSessionRepository;", "<init>", "()V", "core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static PatientSessionRepository instance;

        private Companion() {
        }

        public final PatientSessionRepository get() {
            PatientSessionRepository patientSessionRepository = instance;
            if (patientSessionRepository != null) {
                return patientSessionRepository;
            }
            throw new IllegalArgumentException("you must init for type before".toString());
        }

        public final void init(PatientSessionRepository instance2) {
            u.j(instance2, "instance");
            instance = instance2;
        }
    }

    /* compiled from: PatientSessionRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object get$default(PatientSessionRepository patientSessionRepository, DateTime dateTime, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                dateTime = null;
            }
            return patientSessionRepository.get(dateTime, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
    }

    Object get(DateTime dateTime, d<? super a> dVar);

    Object update(a aVar, d<? super y> dVar);
}
