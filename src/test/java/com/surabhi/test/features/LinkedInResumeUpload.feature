Feature: Resume upload in LinkedIn

  Scenario: Upload resume in LinkedIn
    Given As a user I login to LinkedIn
    And I Verify user "Surabhi Jaiswal" is logged in
    Then I Navigate to Jobs Section
    And I Select Application settings
    Then I Verify if Resume is uploaded
    Then I Delete all existing Resume
    #Then I click on Upload resume(This step is Not required as the file upload work directly by providing the input into the xpath )
    #Note: select xpath with input tage and type as file
    And I upload "Surabhi Jaiswal_Resume.pdf" file
    Then I Verify if Resume is uploaded
    And I upload "Surabhi Jaiswal_Resume.docx" file
    Then I Verify if Resume is uploaded

