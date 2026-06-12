package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data  // (include getter, setter, tostring, requiredArgconstructor, equalandHashcode,Value)
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto
{

    @Schema(
            description = "Account Number of EazyBank account",
            example = "1111111111"
    )
    @NotEmpty(message = "ACCOUNT NUMBER can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "ACCOUNT NUMBER must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account Type  of EazyBank account",
            example = "Saving"
    )
    @NotEmpty(message = "ACCOUNT TYPE can not be a null or empty")
    private String accountType;

    @Schema(
            description = "Branch Address of EazyBank account",
            example = "01 Dindigul"
    )
    @NotEmpty(message = "BRANCH ADDRESS can not be a null or empty")
    private String branchAddress;
}
