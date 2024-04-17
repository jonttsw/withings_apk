package com.withings.programs.model.room.metadata;

import com.withings.programs.model.webservice.wellnesstasks.WsMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: MetadataMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toEntity", "Lcom/withings/programs/model/room/metadata/MetadataEntity;", "Lcom/withings/programs/model/webservice/wellnesstasks/WsMetadata;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MetadataMapperKt {
    public static final MetadataEntity toEntity(WsMetadata wsMetadata) {
        u.j(wsMetadata, "<this>");
        return new MetadataEntity(wsMetadata.getMeasureType());
    }
}
