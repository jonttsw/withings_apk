package com.withings.vasistas.v2.repository;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.List;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: SqlVasistasDao.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006JI\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/withings/vasistas/v2/repository/SqlVasistasDao;", "", "Lcom/withings/vasistas/v2/repository/SqlVasistasDao$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lnm0/y;", "registerListener", "(Lcom/withings/vasistas/v2/repository/SqlVasistasDao$Listener;)V", "unregisterListener", "Lcom/withings/vasistas/model/Vasistas$Category;", "category", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "from", "to", "", "synced", "", "Lcom/withings/vasistas/model/Vasistas;", "getVasistasForCategory", "(Lcom/withings/vasistas/model/Vasistas$Category;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)Ljava/util/List;", "getLastVasistas", "(Lcom/withings/vasistas/model/Vasistas$Category;J)Lcom/withings/vasistas/model/Vasistas;", WsVasistasSerie.KEY_VASISTAS, "insert", "(Ljava/util/List;)V", "Listener", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface SqlVasistasDao {

    /* compiled from: SqlVasistasDao.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    /* compiled from: SqlVasistasDao.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/withings/vasistas/v2/repository/SqlVasistasDao$Listener;", "", "", NavigationArguments.USER_ID, "Lcom/withings/vasistas/model/Vasistas$Category;", "vasistasCategory", "Lorg/joda/time/DateTime;", "from", "to", "Lnm0/y;", "onVasistasUpdated", "(JLcom/withings/vasistas/model/Vasistas$Category;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface Listener {
        void onVasistasUpdated(long j5, Vasistas.Category category, DateTime dateTime, DateTime dateTime2);
    }

    static /* synthetic */ List getVasistasForCategory$default(SqlVasistasDao sqlVasistasDao, Vasistas.Category category, long j5, DateTime dateTime, DateTime dateTime2, Boolean bool, int i11, Object obj) {
        DateTime dateTime3;
        DateTime dateTime4;
        Boolean bool2;
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
            if ((i11 & 16) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            return sqlVasistasDao.getVasistasForCategory(category, j5, dateTime3, dateTime4, bool2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVasistasForCategory");
    }

    Vasistas getLastVasistas(Vasistas.Category category, long j5);

    List<Vasistas> getVasistasForCategory(Vasistas.Category category, long j5, DateTime dateTime, DateTime dateTime2, Boolean bool);

    void insert(List<Vasistas> list);

    void registerListener(Listener listener);

    void unregisterListener(Listener listener);
}
