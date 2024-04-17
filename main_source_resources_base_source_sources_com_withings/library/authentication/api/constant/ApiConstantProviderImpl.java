package com.withings.library.authentication.api.constant;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
/* compiled from: ApiConstantProviderImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/constant/ApiConstantProviderImpl;", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "()V", "getOS", "", "getType", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiConstantProviderImpl implements ApiConstantProvider {
    @Override // com.withings.library.authentication.api.constant.ApiConstantProvider
    public String getOS() {
        return "android";
    }

    @Override // com.withings.library.authentication.api.constant.ApiConstantProvider
    public String getType() {
        return ConstantsWs.APPPFM_TYPENAME_MOBILE;
    }
}
