package Page_object_model_assignmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Active_page_web_elements
{
	Active_page_web_elements(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//web elements for user name text filed 
	private WebElement username;
	
	public WebElement getUsername()
	{
		return username;
	}
	
	//web elements for password  text filed 
		private WebElement pwd;
		
		public WebElement getPassword()
		{
			return pwd;
		}
		
		//web element for login button
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement oLogin;
		public WebElement getLongin()
		{
			return oLogin;
		}
	
		// web element for gettingStartedShortcut panel
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutWindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		
		//web element for log out
		@FindBy(linkText="Logout")
		private WebElement ologout;
		public WebElement getLongout()
		{
			return ologout;
		}
		
		// web elements for Users
		@FindBy(xpath="//div[text()='USERS']")
		private WebElement ousers;
		public  WebElement getUser()
		{
			return ousers;
		}
		
		// for adding new user
		@FindBy(xpath="//div[text()='Add User']")
		private WebElement addusers;
		public  WebElement getAddUser()
		{
			return addusers;
		}
		
		WebElement firstName;
		public  WebElement getFirstname()
		{
			return firstName;
		}
		
		WebElement lastName;
		public  WebElement getlastname()
		{
			return lastName;
		}
		
		WebElement email;
		public  WebElement getemail()
		{
			return email;
		}
		
		@FindBy(xpath="//*[@id='userDataLightBox_usernameField']")
		private WebElement username1;
		public  WebElement getusername1()
		{
			return username1;
		}
		WebElement password;
		public  WebElement getpassword()
		{
			return password;
		}
		
		WebElement passwordCopy;
		public  WebElement getpasswordCopy()
		{
			return passwordCopy;
		}
		@FindBy(xpath="//span[text()='Create User']")
		private WebElement createuserclick;
		public WebElement getcreateuser()
		{
			return createuserclick;
		}
		
		// get web element user name to delete , click on user name to delete 
		@FindBy(xpath="//*[@id='userListTableContainer']")
		private WebElement usernametodelete;
		
		public WebElement getusernametodelete()
		{
			return usernametodelete;
		}
		
		// get web element for delete_user
		@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
		private WebElement usertodelete;
		
		public WebElement getusertodelete()
		{
			return usertodelete;
		}
		
		// user modification 
		// web element for modify user 
		@FindBy(xpath="//span[text()='B, suma']")
		private WebElement modifyuserclick;
		public WebElement getmodifyeuser()
		{
			return modifyuserclick;
		}
		
		// web elemwnt for save changes after modification 
		@FindBy(xpath="//span[text()='Save Changes']")
		private WebElement savechangesclick;
		public WebElement getsavechanges()
		{
			return savechangesclick;
		}
		
		
		//*****************for creating customer
		// get web element for task  click on 
		@FindBy(xpath="//div[text()='TASKS']")
		private WebElement tasks;
		public WebElement gettask()
		{
			return tasks;
		}
		
		// get web element fo radd  new customer  click on 
		@FindBy(xpath="//div[text()='Add New']")
		private WebElement addnewcust;
		public WebElement getnewcustk()
		{
			return  addnewcust;
		}
		// get web element for adding new customer
		@FindBy(xpath="//div[text()='+ New Customer']")
		private WebElement taddnewcust1;
		public WebElement getnewcust1()
		{
			return taddnewcust1;
		}	
			
		// enter customer name 
		@FindBy(xpath="//input[@id='customerLightBox_nameField']")
		private WebElement cust_name;
		public WebElement getenterCostname()
		{
			return cust_name;
		}	
		// web element for create customer button
		@FindBy(xpath="//span[text()='Create Customer']")
		private WebElement createcust;
		public WebElement getcreatecustbotton()
		{
			return createcust;
		}	
		
		//// web elements for delete customer
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")
		private WebElement custtodelete;
		
		public WebElement getucusttodelete()
		{
			return custtodelete;
		}
		
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement custtodelete1;
		
		public WebElement getucusttodelete1()
		{
			return custtodelete1;
		}
		
		// web element for detele customer action 
		@FindBy(xpath="//div[text()='ACTIONS']")
		private WebElement deletecustaction;
		public WebElement getdeletecustaction()
		{
			return deletecustaction;
		}	
		
		// web element for detele customer action 
		@FindBy(xpath="//div[text()='Delete']")
		private WebElement deletecustaction1;
		public WebElement getdeletecustaction1()
		{
			return deletecustaction1;
		}
		// web element to delete cust
		@FindBy(xpath="//div[text()=Delete']")
		private WebElement deletecust;
		public  WebElement getdeletecust1()
		{
			return deletecust;
		}
		
		// web element for confirmation to delete
		
		@FindBy(xpath="//span[@id='customerPanel_deleteConfirm_submitTitle']")
		private WebElement deletecust1;
		public  WebElement getdeletecust11()
		{
			return deletecust1;
		}
		// web element for modication os customer
		// modift the descroption 
		
		@FindBy(xpath="//textarea[@placeholder='Enter customer description...']")
		private WebElement modifycust;
		public  WebElement getmodifycust()
		{
			return modifycust;
		}
		// web elements for create project 
		// get web element for adding new project
				@FindBy(xpath="//div[text()='+ New Project']")
				private WebElement taddnewproject;
				public WebElement getnewproject()
				{
					return taddnewproject;
				}	
				// get web element for entering  new project name
				@FindBy(xpath="//input[@id='projectPopup_projectNameField']")
				private WebElement enterprojectname;
				public WebElement gettoenterprojectname()
				{
					return enterprojectname;
				}
				
				// web element for create project button
				
				@FindBy(xpath="//span[text()='Create Project']")
				private WebElement createprojectclick;
				public WebElement getcreateprojectclick()
				{
					return createprojectclick;
				}
				
				// web element to get name of project to delete
				@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")
				private WebElement projectname;
				public WebElement getprojectname()
				{
					return projectname;
				}
				@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
				private WebElement projectname1;
				public WebElement getprojectname1()
				{
					return projectname1;
				}
				// web emelemnt to enter descprition in project
				@FindBy(xpath="//textarea[@placeholder='Enter project description...']")
				private WebElement modifyprojectdesc;
				public  WebElement getmodifyprojectdec()
				{
					return modifyprojectdesc;
				}
				// web element to get action on project
				@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")
				private WebElement actionpartproject;
				public  WebElement getactiononproject()
				{
					return actionpartproject;
				}
				// web element to get  delete action on project
				@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
				private WebElement deleteproject;
				public  WebElement getdeleteproject()
				{
					return deleteproject;
				}
				@FindBy(xpath="//*[@id='projectPanel_deleteConfirm_submitTitle']")
				private WebElement deleteprojectconfirm;
				public  WebElement getdeleteprojectconfirm()
				{
					return deleteprojectconfirm;
				}
				///end of delete project
				
				// we elements related to tasks
				// click on add task to the project
				@FindBy(xpath="//*[@id='createTasksHeaderBlock']")
				private WebElement createTask;
				public WebElement getgettasks()
				{
					return createTask;
				}
				// web elementto enter task1
				@FindBy(xpath="//*[@id='projectPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
				private WebElement entertask1;
				public WebElement getentertask11()
				{
					return entertask1;
				}
				// get task1 to modify
				@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[2]/tbody/tr/td[2]/div/div[2]")
				private WebElement modifytask1;
				public WebElement getmodifytask1()
				{
					return modifytask1;
				}
				@FindBy(xpath="//*[@id=taskListBlock']/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[1]")
				private WebElement opentaskclick;
				public WebElement getopentask1click()
				{
					return opentaskclick;
				}
				
				// modify task1 from open to compplted
				@FindBy(xpath="//div[@class='Completed']")
				private WebElement modifytask1tocompleted;
				public WebElement getmodifytask1tocompletedtask1()
				{
					return modifytask1tocompleted;
				}
				//web element to enter task desciption
				@FindBy(xpath="//textarea[@placeholder='Enter task description...']")
				private WebElement modifytaskdesc;
				public  WebElement getmodiftasdec()
				{
					return modifytaskdesc;
				}
				// web element to get ACTION ON TASKS
				//*[@id="taskListBlock"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]
				
				//*[@id="taskListBlock"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]
				@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
				private WebElement actionparttask;
				public  WebElement getactionontask()
				{
					return actionparttask;
				}
				//*[@id="taskListBlock"]/div[3]/div[4]/div/div[3]/div
				// GET DELETE BUTTON IN TASK ACTION
				@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")
				private WebElement actiondeleteparttask;
				public  WebElement getactiondeleteontask()
				{
					return actiondeleteparttask;
				}
				
				//Web element fro delete conformation for task
				
				@FindBy(xpath="//*[@id='taskPanel_deleteConfirm_submitBtn']/div")
				private WebElement actiondeleteparttaskconf;
				public  WebElement getactiondeleteontaskconf()
				{
					return actiondeleteparttaskconf;
				}
				
				
				
				
}		

