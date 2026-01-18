# SauceDemo
QA Automation Project with Selenium and Java for SauceDemo This project automates tests for the SauceDemo web application using Selenium WebDriver and Java. It includes scripts to verify login, product details, and cart operations. Features:  Test Automation Login Tests Product Verification Cart Operations TestNG Framework

# Test Plan

## Project Overview
This test plan outlines the approach for automating test cases for the **Sauce Demo** website using Selenium. The goal is to validate key functionalities of the website, including user authentication, product management, and checkout processes, ensuring that the site performs as expected under various scenarios.

## Scope
The scope of this testing includes:

- User login/logout functionality.
- Product interactions, such as adding/removing items from the cart.
- Navigation and display of product details.
- Checkout process, including payment and order confirmation.
- Sorting and filtering of products.

## Test Objectives
- Ensure the integrity of the user authentication process.
- Validate that the cart functionality operates correctly across sessions.
- Confirm that products can be viewed, sorted, filtered, and managed in the cart.
- Verify the checkout process from cart review to order confirmation.

## Testing Tools
- **Selenium** for automation.
- **TestNG** for test management and reporting.

## Assumptions
- The website is stable and available for testing.
- Valid user credentials are available for testing.

## Deliverables
- Automated test scripts for the identified test cases.
- A report summarizing test results, including pass/fail status for each test case.

## Test Execution
The tests will be executed locally and can be integrated with CI/CD pipelines for continuous testing. The results will be analyzed, and any defects found will be reported for further investigation.

## Test Cases

### 1. Login with Valid Credentials
- **Steps:**
  1. Navigate to the login page.
  2. Enter a valid username and password.
  3. Click on the "Login" button.
- **Expected Result:** The user is redirected to the Products page.

### 2. Login with Invalid Credentials
- **Steps:**
  1. Navigate to the login page.
  2. Enter an invalid username and/or password.
  3. Click on the "Login" button.
- **Expected Result:** An error message is displayed indicating incorrect credentials.

### 3. Test Case: Validate Products

- **Objective:** Verify that the products listed on the Products page are displayed with the correct amount and description.

- **Steps:**
  1. Log in to the Sauce Demo application.
  2. Verify that the number of products displayed matches the expected amount.
  3. Verify that each product's description is accurate and matches the expected descriptions.

- **Expected Result:** 
  - The number of products displayed on the Products page should match the expected count.
  - Each product should have an accurate and correctly displayed description.

### 4. Test Case: Add All Products to the Cart

- **Objective:** Ensure that all products can be added to the cart successfully and that the cart icon and remove buttons function correctly.

- **Steps:**
  1. Log in to the Sauce Demo application.
  2. Add all available products to the cart.
  3. Verify that the cart icon displays the correct number of added products.
  4. Verify that the "Remove" button is displayed for each product added to the cart.

- **Expected Result:** 
  - All products should be added to the cart, and the cart icon should show the correct number of items.
  - A "Remove" button should be visible for each product added to the cart.

### 5. Complete a Purchase
- **Steps:**
  1. Add a product to the cart.
  2. Proceed to checkout.
  3. Enter shipping information.
  4. Click on "Finish" to complete the purchase.
- **Expected Result:** A confirmation page is displayed with the order details.

### 6. View Product Details
- **Steps:**
  1. Log in with valid credentials.
  2. Navigate to the Products page.
  3. Click on a product name or image.
- **Expected Result:** The product details page is displayed with relevant information.

### 7. Sort Products by Price (Low to High)
- **Steps:**
  1. Log in with valid credentials.
  2. Navigate to the Products page.
  3. Select "Price (low to high)" from the sorting dropdown.
- **Expected Result:** The products are sorted by price in ascending order.

### 8. Filter Products by Category
- **Steps:**
  1. Log in with valid credentials.
  2. Navigate to the Products page.
  3. Apply a filter by category (e.g., "T-Shirts").
- **Expected Result:** Only products within the selected category are displayed.

### 9. Logout
- **Steps:**
  1. Log in with valid credentials.
  2. Click on the menu button.
  3. Click on "Logout".
- **Expected Result:** The user is logged out and redirected to the login page.

### 10. Check Cart Persistence After Logout/Login
- **Steps:**
  1. Add a product to the cart.
  2. Log out of the application.
  3. Log in again with the same credentials.
- **Expected Result:** The cart retains the previously added product.