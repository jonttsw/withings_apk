package com.withings.features.platform.model;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.features.platform.api.Tag;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PlatformTagDao.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH'¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/withings/features/platform/model/PlatformTagDao;", "", "", "Lcom/withings/features/platform/api/Tag;", "tags", "Lnm0/y;", "insert", "(Ljava/util/List;)V", "", "ownerType", "", "ownerId", "getByOwner", "(Ljava/lang/String;J)Ljava/util/List;", "getAllTags", "()Ljava/util/List;", "tagSearch", "hasTagEnabled", "(Ljava/lang/String;JLjava/lang/String;)Lcom/withings/features/platform/api/Tag;", CervicalMucusRecord.Appearance.CLEAR, "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface PlatformTagDao {
    void clear();

    List<Tag> getAllTags();

    List<Tag> getByOwner(String str, long j5);

    Tag hasTagEnabled(String str, long j5, String str2);

    void insert(List<Tag> list);
}
