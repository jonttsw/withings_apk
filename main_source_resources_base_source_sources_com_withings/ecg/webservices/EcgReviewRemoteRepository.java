package com.withings.ecg.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: EcgReviewRemoteRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u0012J(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0012¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/withings/ecg/webservices/EcgReviewRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/ecg/webservices/EcgReviewRemoteRepository;", "", NavigationArguments.USER_ID, "deviceId", "Lcom/withings/ecg/webservices/GetEcgReviewResponse;", "get", "(JJLqm0/d;)Ljava/lang/Object;", "Lcom/withings/ecg/webservices/ListStateCodeResponse;", "getStatesList", "(Lqm0/d;)Ljava/lang/Object;", "stateCode", "Lcom/withings/ecg/webservices/StoreEcgReviewResponse;", "store", "(JJLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "phoneNumber", "Lnm0/y;", "sendCode", XHTMLText.CODE, "checkCode", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface EcgReviewRemoteRepository {
    Object checkCode(long j5, long j11, String str, d<? super y> dVar);

    Object get(long j5, long j11, d<? super GetEcgReviewResponse> dVar);

    Object getStatesList(d<? super ListStateCodeResponse> dVar);

    Object sendCode(long j5, long j11, String str, d<? super y> dVar);

    Object store(long j5, long j11, String str, d<? super StoreEcgReviewResponse> dVar);

    EcgReviewRemoteRepository withSyncContext(String str);
}
