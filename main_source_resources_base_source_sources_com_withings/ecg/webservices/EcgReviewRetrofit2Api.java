package com.withings.ecg.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.webservices.legacy.common.exception.UnauthorizedException;
import fr0.c;
import fr0.e;
import fr0.f;
import fr0.o;
import fr0.t;
import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: EcgReviewRetrofit2Api.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0012\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0014\u0010\u000f¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/withings/ecg/webservices/EcgReviewRetrofit2Api;", "", "", NavigationArguments.USER_ID, "deviceId", "Lcom/withings/ecg/webservices/GetEcgReviewResponse;", "get", "(JJLqm0/d;)Ljava/lang/Object;", "Lcom/withings/ecg/webservices/ListStateCodeResponse;", "getStatesList", "(Lqm0/d;)Ljava/lang/Object;", "", "stateCode", "Lcom/withings/ecg/webservices/StoreEcgReviewResponse;", "store", "(JJLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "phoneNumber", "Lnm0/y;", "sendCode", XHTMLText.CODE, "checkCode", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface EcgReviewRetrofit2Api {
    @e
    @o("v2/ecgreview?action=checkcode")
    Object checkCode(@t("userid") long j5, @t("deviceid") long j11, @c("code") String str, d<? super y> dVar) throws UnauthorizedException;

    @f("v2/ecgreview?action=get")
    Object get(@t("userid") long j5, @t("deviceid") long j11, d<? super GetEcgReviewResponse> dVar);

    @f("v2/ecgreview?action=liststatecodes")
    Object getStatesList(d<? super ListStateCodeResponse> dVar);

    @o("v2/ecgreview?action=sendcode")
    Object sendCode(@t("userid") long j5, @t("deviceid") long j11, @t("phonenumber") String str, d<? super y> dVar) throws UnauthorizedException;

    @o("v2/ecgreview?action=store")
    Object store(@t("userid") long j5, @t("deviceid") long j11, @t("state_code") String str, d<? super StoreEcgReviewResponse> dVar);
}
