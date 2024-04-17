package com.withings.vasistas.v2.repository;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.v2.model.Vasistas;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: VasistasRepository.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017JS\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u000f\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\fH¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/withings/vasistas/v2/repository/VasistasRepository;", "", "Lcom/withings/vasistas/v2/model/Vasistas;", "T", "Ljava/lang/Class;", "vasistasClass", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "from", "to", "Lkotlinx/coroutines/flow/Flow;", "", "get", "(Ljava/lang/Class;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "getLastVasistas", "(Ljava/lang/Class;J)Lcom/withings/vasistas/v2/model/Vasistas;", "vasistasList", "Lnm0/y;", "add", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "synchronize", "(Lqm0/d;)Ljava/lang/Object;", "Companion", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface VasistasRepository {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: VasistasRepository.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lcom/withings/vasistas/v2/repository/VasistasRepository$Companion;", "", "Lcom/withings/vasistas/v2/repository/VasistasRepository;", "get", "()Lcom/withings/vasistas/v2/repository/VasistasRepository;", "instance", "Lnm0/y;", "init", "(Lcom/withings/vasistas/v2/repository/VasistasRepository;)V", "Lcom/withings/vasistas/v2/repository/VasistasRepository;", "<init>", "()V", "core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static VasistasRepository instance;

        private Companion() {
        }

        public final VasistasRepository get() {
            VasistasRepository vasistasRepository = instance;
            if (vasistasRepository != null) {
                return vasistasRepository;
            }
            throw new IllegalArgumentException("you must init for type before".toString());
        }

        public final void init(VasistasRepository instance2) {
            u.j(instance2, "instance");
            instance = instance2;
        }
    }

    /* compiled from: VasistasRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Flow get$default(VasistasRepository vasistasRepository, Class cls, long j5, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
        DateTime dateTime3;
        DateTime dateTime4;
        if (obj == null) {
            if ((i11 & 4) != 0) {
                dateTime3 = null;
            } else {
                dateTime3 = dateTime;
            }
            if ((i11 & 8) != 0) {
                dateTime4 = null;
            } else {
                dateTime4 = dateTime2;
            }
            return vasistasRepository.get(cls, j5, dateTime3, dateTime4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
    }

    <T extends Vasistas> Object add(List<? extends T> list, d<? super y> dVar);

    <T extends Vasistas> Flow<List<T>> get(Class<T> cls, long j5, DateTime dateTime, DateTime dateTime2);

    <T extends Vasistas> Vasistas getLastVasistas(Class<T> cls, long j5);

    Object synchronize(d<? super y> dVar);
}
