package com.withings.factor.remote.repository.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import fr0.c;
import fr0.e;
import fr0.o;
import hr.a;
import hr.b;
import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import qm0.d;
/* compiled from: FactorRetrofit2Api.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001JF\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJF\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/withings/factor/remote/repository/api/FactorRetrofit2Api;", "", "", NavigationArguments.USER_ID, "", "factorType", "startDate", "endDate", "numberOfPills", "Lhr/b;", "store", "(JIJLjava/lang/Long;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "factorId", "Lnm0/y;", DiscoverItems.Item.UPDATE_ACTION, "(JJJLjava/lang/Long;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "updateEnd", "(JJLjava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "lastUpdate", "Lhr/a;", "get", "(JLjava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "delete", "(JJLqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface FactorRetrofit2Api {
    @e
    @o("/v2/cyclefactor?action=delete")
    Object delete(@c("userid") long j5, @c("cyclefactorid") long j11, d<? super y> dVar);

    @e
    @o("/v2/cyclefactor?action=get")
    Object get(@c("userid") long j5, @c("lastupdate") Long l5, d<? super a> dVar);

    @e
    @o("v2/cyclefactor?action=store")
    Object store(@c("userid") long j5, @c("factor_type") int i11, @c("startdate") long j11, @c("enddate") Long l5, @c("nb_of_pills") Integer num, d<? super b> dVar);

    @e
    @o("v2/cyclefactor?action=update")
    Object update(@c("userid") long j5, @c("cyclefactorid") long j11, @c("startdate") long j12, @c("enddate") Long l5, @c("nb_of_pills") Integer num, d<? super y> dVar);

    @e
    @o("v2/cyclefactor?action=update")
    Object updateEnd(@c("userid") long j5, @c("cyclefactorid") long j11, @c("enddate") Long l5, d<? super y> dVar);
}
