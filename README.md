<h1>Report: Bank Web Service</h1>
    <h2>Introduction</h2>
    <p>This report provides a detailed overview of the "Bank Web Service" project, which was developed to demonstrate the capabilities of modern web service technologies using JAX-WS. The service facilitates various banking operations via a SOAP-based interface, including currency conversion and account management. The project showcases the application of XML web services in real-world scenarios, enhancing understanding of both client and server-side implementations.</p>

  <h2>Project Structure</h2>
    <p>The project is organized into several packages and modules, detailing the server side as well as the generated SOAP client:</p>
    <ul>
        <li><strong>ma.enset</strong>: Contains the main classes of the server project.</li>
        <li><strong>ma.enset.BankService</strong>: Service class exposing the operations of the bank.</li>
        <li><strong>ma.enset.Account</strong>: Model class for bank accounts.</li>
        <li><strong>ma.enset.ServerJWS</strong>: Class to start the JAX-WS server.</li>
        <li><strong>client-SOAP-java</strong>: Client project containing the generated stub and access classes for the service.</li>
        <li><strong>proxy</strong>: Automatically generated folder containing the stubs and other classes necessary for interacting with the web service. This folder includes:</li>
        <ul>
            <li><code>BankService</code> and <code>BanqueWS</code>: Stub classes for the web service.</li>
            <li><code>Account</code>, <code>AccountList</code>, <code>AccountListResponse</code>: Classes to manage account information.</li>
            <li><code>ConversionEuroToDH</code>, <code>ConversionEuroToDHResponse</code>: Classes for currency conversion.</li>
            <li><code>GetAccount</code>, <code>GetAccountResponse</code>: Classes to retrieve the details of an account.</li>
        </ul>
    </ul>

  <h2>Web Service Features</h2>
    <ol>
        <li><strong>Currency Conversion (<code>conversion</code>)</strong>: Converts an amount from Euro to DH. The conversion uses a predefined exchange rate.</li>
        <li><strong>Account Inquiry (<code>getAccount</code>)</strong>: Allows retrieval of specific account information by its identifier.</li>
        <li><strong>Account List Inquiry (<code>accountList</code>)</strong>: Provides a list of all available accounts with their details.</li>
    </ol>

  <h2>Execution and Deployment</h2>
    <p>The JAX-WS server is started via the <code>ma.enset.ServerJWS</code> class, exposing the service at <code>http://localhost:9090/bankService</code>. The SOAP client can interact with the service using the classes generated in the <code>proxy</code> folder.</p>

  <h2>Consultation and Analysis of the WSDL</h2>
    <p>The WSDL generated by the service can be consulted at the URL <code>http://localhost:9090/bankService?wsdl</code>. This WSDL interface allows developers to understand and interact with the service without direct access to the server code.</p>

  <h2>Testing the Operations</h2>
    <p>The operations of the web service can be tested using tools such as SoapUI or Postman for SOAP by loading the WSDL and sending requests to the different operations exposed.</p>
