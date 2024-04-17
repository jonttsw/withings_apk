package com.withings.programs.model.programoverview.programoverview;

import com.samsung.android.sdk.healthdata.HealthConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: ProgramOverviewEntity.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ProgramOverviewEntity$$serializer implements GeneratedSerializer<ProgramOverviewEntity> {
    public static final ProgramOverviewEntity$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ProgramOverviewEntity$$serializer programOverviewEntity$$serializer = new ProgramOverviewEntity$$serializer();
        INSTANCE = programOverviewEntity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.programoverview.programoverview.ProgramOverviewEntity", programOverviewEntity$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("identifier", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement(HealthConstants.FoodInfo.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement("isNew", true);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("contentTypePreview", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedDevices", false);
        pluginGeneratedSerialDescriptor.addElement("deviceDescription", true);
        pluginGeneratedSerialDescriptor.addElement("accessLevel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProgramOverviewEntity$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = ProgramOverviewEntity.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, kSerializerArr[5], kSerializerArr[6], kSerializerArr[7], BuiltinSerializersKt.getNullable(stringSerializer), IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ProgramOverviewEntity deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        String str;
        String str2;
        List list;
        List list2;
        List list3;
        int i12;
        boolean z5;
        String str3;
        String str4;
        String str5;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = ProgramOverviewEntity.$childSerializers;
        int i13 = 9;
        int i14 = 8;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 3);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 4);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            i11 = beginStructure.decodeIntElement(descriptor2, 9);
            str5 = decodeStringElement3;
            i12 = 1023;
            z5 = decodeBooleanElement;
            str4 = decodeStringElement2;
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            str3 = decodeStringElement;
            str2 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
        } else {
            boolean z11 = true;
            int i15 = 0;
            boolean z12 = false;
            String str6 = null;
            List list4 = null;
            List list5 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            List list6 = null;
            int i16 = 0;
            while (z11) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z11 = false;
                        i14 = 8;
                        break;
                    case 0:
                        i16 |= 1;
                        str7 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, str7);
                        i13 = 9;
                        i14 = 8;
                        break;
                    case 1:
                        str8 = beginStructure.decodeStringElement(descriptor2, 1);
                        i16 |= 2;
                        i13 = 9;
                        break;
                    case 2:
                        str9 = beginStructure.decodeStringElement(descriptor2, 2);
                        i16 |= 4;
                        i13 = 9;
                        break;
                    case 3:
                        str10 = beginStructure.decodeStringElement(descriptor2, 3);
                        i16 |= 8;
                        i13 = 9;
                        break;
                    case 4:
                        z12 = beginStructure.decodeBooleanElement(descriptor2, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        list6 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], list6);
                        i16 |= 32;
                        break;
                    case 6:
                        list5 = (List) beginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], list5);
                        i16 |= 64;
                        break;
                    case 7:
                        list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], list4);
                        i16 |= 128;
                        break;
                    case 8:
                        str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i14, StringSerializer.INSTANCE, str6);
                        i16 |= 256;
                        break;
                    case 9:
                        i15 = beginStructure.decodeIntElement(descriptor2, i13);
                        i16 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i15;
            str = str6;
            str2 = str7;
            list = list4;
            list2 = list5;
            list3 = list6;
            i12 = i16;
            z5 = z12;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        beginStructure.endStructure(descriptor2);
        return new ProgramOverviewEntity(i12, str2, str3, str4, str5, z5, list3, list2, list, str, i11, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ProgramOverviewEntity value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        ProgramOverviewEntity.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
